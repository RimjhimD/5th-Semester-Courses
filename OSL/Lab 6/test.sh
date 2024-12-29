echo "Hello World"
echo  Hello World


#VARIABLE DECLARATION

a=Rii
echo $a

b=123
echo $b

b=14
c=39

#sum=$((14+39))
#echo $sum

#sum=$((b+c))
#echo $sum

#echo Enter the var
#read d

#read -p "Enter the var " e 
#read s r
#echo The name of student 1 $s and the name of student 2 $r


echo "insert 3 var: "
read x y z
echo "The sum is " $((x+y+z))

read a b
if [ $a -gt $b ]
then 
   echo $a is greater than $b
elif [ $a -lt $b ]
then
    echo $a is less than $b   
else
     echo $a and $b are equal
fi

