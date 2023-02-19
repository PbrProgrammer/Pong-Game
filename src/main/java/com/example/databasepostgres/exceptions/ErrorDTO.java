package com.example.databasepostgres.exceptions;


import java.util.Date;
import org.apache.commons.lang3.RandomStringUtils;

public class ErrorDTO {
    private Date date = new Date();
    private String message;
    private String type;
    private Integer code;
    private String traceId = RandomStringUtils.randomAlphanumeric(10);
    private String path;

    public ErrorDTO() {
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }

    public String getType() {
        return this.type;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public String getPath() {
        return this.path;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setTraceId(final String traceId) {
        this.traceId = traceId;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ErrorDTO)) {
            return false;
        } else {
            ErrorDTO other = (ErrorDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$date = this.getDate();
                Object other$date = other.getDate();
                if (this$date == null) {
                    if (other$date != null) {
                        return false;
                    }
                } else if (!this$date.equals(other$date)) {
                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                label62: {
                    Object this$type = this.getType();
                    Object other$type = other.getType();
                    if (this$type == null) {
                        if (other$type == null) {
                            break label62;
                        }
                    } else if (this$type.equals(other$type)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$traceId = this.getTraceId();
                    Object other$traceId = other.getTraceId();
                    if (this$traceId == null) {
                        if (other$traceId == null) {
                            break label55;
                        }
                    } else if (this$traceId.equals(other$traceId)) {
                        break label55;
                    }

                    return false;
                }

                Object this$path = this.getPath();
                Object other$path = other.getPath();
                if (this$path == null) {
                    if (other$path != null) {
                        return false;
                    }
                } else if (!this$path.equals(other$path)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ErrorDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $code = this.getCode();
         result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        Object $traceId = this.getTraceId();
        result = result * 59 + ($traceId == null ? 43 : $traceId.hashCode());
        Object $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    public String toString() {
        Date var10000 = this.getDate();
        return "ErrorDTO(date=" + var10000 + ", message=" + this.getMessage() + ", type=" + this.getType() + ", code=" + this.getCode() + ", traceId=" + this.getTraceId() + ", path=" + this.getPath() + ")";
    }
}
