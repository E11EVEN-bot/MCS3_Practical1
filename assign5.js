let http = require('http');
let fs = require('fs');

let handleRequest = (request, response) => {
    response.writeHead(200, {
        'Content-Type': 'text/html'
    });
    fs.readFile('./index.html', null, function (error, data) {
        if (error) {
            response.writeHead(404);
            respone.write('Whoops! File not found!');
        } else {
            response.write(data);
        }
        response.end();
    });
};

http.createServer(handleRequest).listen(8000); 
 

a=fs.readFileSync("file1.txt", "utf8");

fs.appendFile("file2.txt", a, (err) => {
if (err) {
	console.log(err);
}
else {

	console.log("\nFile Contents of file 2 after append:\n",
	fs.readFileSync("file2.txt", "utf8"));
}
});
