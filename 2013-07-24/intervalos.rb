class Intervalos

	def initialize(lista)
		@lista = lista.sort()
	end

	def to_s
		if @lista.size == 1
			resultado = @lista.to_s
		elsif sao_vizinhos
			resultado = "[#{@lista[0]}-#{@lista[1]}]"		
		else
            ret = nil
            @lista.each do | k |
                if ret == nil
                    ret = "[#{k}]"
                else
                    ret += ", [#{k}]"
                end
            end
            resultado = ret
			#resultado = "[#{@lista[0]}], [#{@lista[1]}]"
		end
		resultado
	end

	def sao_vizinhos
		@lista[0] + 1 == @lista[1]

        @lista.each do | k |

	end
end
