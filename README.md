# MIS104AProjects

This project was given by a company as an interview question.

 ### Purpose: 

The purpose of the code is to encrypt a message using a given key.

 ### Approach: 

The code uses a loop to encrypt the message character by character. The number of iterations the encryption will be 
performed on each character is determined by the first digit of the key. The first digit is extracted and stored in the 
pass variable. The loop continues until all characters in the message have been encrypted.

 ### Variables: 

The following variables are used in the code
 - message: The input message to be encrypted.
 - key: The encryption key used to encrypt the message.
 - pass: The first digit of the key, used to determine the number of encryption iterations.
 - encryptedMessage: The result of the encryption, a string of encrypted characters.
 - messageIndex: A counter variable to keep track of the current character in the message.
 - keyIndex: A counter variable to keep track of the current digit in the key.

 ### Algorithm: 
 The code performs the following steps

 - Extract the first digit of the key and store it in the pass variable.
 - Initialize an empty string encryptedMessage to store the encrypted message.
 - Initialize the counter variables messageIndex and keyIndex to 0.
 - Use a while loop to encrypt the message character by character.
 - Use the Integer.valueOf() method to convert the pass variable to an integer and store it in the iterate variable.
 - Extract the current character in the message using message.charAt(messageIndex) and store it in the encryptedChar variable.
 - Use a for loop to encrypt the encryptedChar variable iterate number of times.
 - Concatenate the encrypted character to the encryptedMessage string.
 - Increment both messageIndex and keyIndex by 1.
 - If keyIndex is equal to the length of the key, reset it to 0.
 - Repeat the loop until all characters in the message have been encrypted.
 - Return the encryptedMessage.

 ### Sample Run Table

| Encrption/Decryption | Input | Output |
  | ---------------------| -------------- |------------------------------------| 
  | encrpytpion          | This is MIS104 final exam program. | v!isTVA MR*N04T$Cna^c(xaaclrox\nm. |
  | encryption           | In this project, I used objectoriented Java programming language. | !t t!VA p,l)ec$4TI X7(d 2e)ec$l,ietf(d 3]ca l\2grnxainxc^anxwngee |
  | decryption           | !TcatcXseTf!isTo,og,]a f2\Tsevw,e vlamutVvatClt wCf! mSc&ri([5s. | I can use this program for secure communication with my friends. |
  | decryption           | j(y awAt @@Tsev\(t $lTpr2f(ctTDntaT$,omTwtau$I2riu@5 avT(sse | Key must be secret to protect data from unauthorized access. |
  
