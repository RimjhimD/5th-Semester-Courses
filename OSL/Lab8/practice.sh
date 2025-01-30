# read a
# if (($a%2==0)) 
# then
#     echo "even"
# else
#     echo "odd"
# fi

# read b
# if (($b>=10 && $b<=50))
# then
# 	echo "between 10 and 50"
# else
# 	echo "out of range"
# fi

# i = 1
# while ((i <= 10))
# do
# echo $i
# i=$((i+1))
# done

# for((i=1;i<=10;i++))
# do
# echo $i
# done

# arr=(1 2 3 4 5 6 7 8 9 10)
# for i in "${arr[@]}"
# do	
# 	echo $i
# done
# echo "length of array is ${#arr[@]}"

# arr=()
# for((i=1;i<=5;i++))
# do
# 	read a
# 	arr+=($a)
# done
# echo "${arr[@]}"
# echo "length of array is ${#arr[@]}"

# arr=()
# for((i=1;i<=10;i++))
# do 
# 	read a
# 	arr+=($a)
# done

# sum=0
# for i in "${arr[@]}"
# do
# 	sum=$((sum+i))
# done
# echo "sum is $sum"

# primes=()
# for ((i=2;i<=100;i++))
# do
#     is_prime=1
#     for ((j=2;j*j<=i;j++))
#     do
#         if ((i%j==0))
#         then
#             is_prime=0  
#             break
#         fi
#     done
#     if ((is_prime == 1))
#     then
#         primes+=($i)
#     fi
# done
# echo "Prime numbers: ${primes[@]}"

# func( ) {
	# echo "this is a function"
# }
# func
