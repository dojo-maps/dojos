require "./intervalos"
require "test/unit"
 
class TesteIntervalo < Test::Unit::TestCase
 
	def test_intervalo_unico
		intervalos = Intervalos.new([3])
 		assert_equal("[3]", intervalos.to_s())
	end
  
	def test_intervalo_separado_3_e_5
		intervalos = Intervalos.new([3, 5])
		assert_equal("[3], [5]", intervalos.to_s())
	end

	def test_intervalo_separado_5_e_7
		intervalos = Intervalos.new([5, 7])
		assert_equal("[5], [7]", intervalos.to_s())
	end

	def test_intervalo_fora_de_ordem
		intervalos = Intervalos.new([6, 5])
		assert_equal("[5-6]", intervalos.to_s())
	end

	def test_intervalo_separado_de_tres_numeros
		intervalos = Intervalos.new([7, 9, 13])
		assert_equal("[7], [9], [13]", intervalos.to_s())
	end
    def test_intervalo_de_tres_numeros
		intervalos = Intervalos.new([7, 8, 9])
		assert_equal("[7-9]", intervalos.to_s())
    end
end
