<h1>Redis-Project</h1>

<p>
This project is a simple implementation of <b>Redis caching</b> using a Spring Boot application.
It is built for learning how Redis works for storing and retrieving data from cache.
</p>

<hr/>

<h2>📌 Description</h2>
<p>
This project demonstrates basic CRUD operations using Redis as an in-memory data store.
User data is stored, fetched, and deleted directly from Redis cache.
</p>

<ul>
  <li>Store user data in Redis</li>
  <li>Fetch user by ID</li>
  <li>Retrieve all users</li>
  <li>Delete user from cache</li>
</ul>

<hr/>

<h2>⚙️ How It Works</h2>
<ol>
  <li>User sends request via REST API</li>
  <li>Controller handles the request</li>
  <li>DAO layer interacts with Redis</li>
  <li>Data is stored and retrieved from cache</li>
</ol>

<hr/>

<h2>🛠️ Tech Stack</h2>
<ul>
  <li>Spring Boot</li>
  <li>Redis</li>
  <li>Java</li>
</ul>

<hr/>

<h2>📂 API Endpoints</h2>

<ul>
  <li><b>POST /save</b> → Save a new user</li>
  <li><b>GET /get?userId=</b> → Get user by ID</li>
  <li><b>GET /getAll</b> → Get all users</li>
  <li><b>DELETE /delete?userId=</b> → Delete user</li>
</ul>

<hr/>

<h2>▶️ How to Run</h2>
<ol>
  <li>Start Redis server</li>
  <li>Run Spring Boot application</li>
  <li>Use Postman or browser to test APIs</li>
</ol>

<hr/>

<h2>🎯 Purpose</h2>
<ul>
  <li>Learn Redis basics</li>
  <li>Understand caching mechanism</li>
  <li>Practice CRUD operations with Redis</li>
</ul>

<hr/>

<h2>📌 Future Improvements</h2>
<ul>
  <li>Add expiration (TTL) for cache</li>
  <li>Integrate with database + cache (cache-aside pattern)</li>
  <li>Add validation and error handling</li>
  <li>Dockerize Redis setup</li>
</ul>

<hr/>

<h2>🤝 Contributing</h2>
<p>
Feel free to fork and improve this project.
</p>
