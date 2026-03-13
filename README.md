# admin-server-monitoring

Spring Boot Admin server that monitors the [`circuit-breaker-service`](../circuit-breaker-service) and visualizes Circuit Breaker state changes in real time.

---

## Requirements

- Java 21+
- Maven 3.8+
- [`circuit-breaker-service`](../circuit-breaker-service) running on port `8081`

---

## Run

```bash
./mvnw spring-boot:run
```

> ⚠️ Start this service **before** `circuit-breaker-service` so the client can register on startup.

Dashboard available at: **http://localhost:8080**

---

## What to look for in the dashboard

Once both services are running, open `circuit-breaker-service` → **Health** tab to see the circuit breaker state update in real time:

| State | Color | Meaning |
|---|---|---|
| `CLOSED` | 🟢 Green | Circuit operative, requests flowing normally |
| `OPEN` | 🔴 Red | Circuit open, requests blocked automatically |
| `HALF_OPEN` | 🟡 Yellow | Testing recovery with a limited number of calls |

---

## Related projects

- [`circuit-breaker-service`](../circuit-breaker-service) — Circuit Breaker pattern implementation with Resilience4j