package com.google.android.gms.smartdevice.setup.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.defn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class StartSessionResponse extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new defn();
    private static final HashMap i;
    public final Set a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("status", new FastJsonResponse$Field(0, false, 0, false, "status", 2, null));
        hashMap.put("rejectionReason", new FastJsonResponse$Field(0, false, 0, false, "rejectionReason", 3, null));
        hashMap.put("credential", new FastJsonResponse$Field(7, false, 7, false, "credential", 4, null));
        hashMap.put("targetFallbackUrl", new FastJsonResponse$Field(7, false, 7, false, "targetFallbackUrl", 5, null));
        hashMap.put("targetSessionId", new FastJsonResponse$Field(7, false, 7, false, "targetSessionId", 6, null));
        hashMap.put("sourceFallbackUrl", new FastJsonResponse$Field(7, false, 7, false, "sourceFallbackUrl", 7, null));
        hashMap.put("accountIdentifier", new FastJsonResponse$Field(7, false, 7, false, "accountIdentifier", 8, null));
    }

    public StartSessionResponse(Set set, int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        this.a = set;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return Integer.valueOf(this.c);
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
                return this.h;
            default:
                throw new IllegalStateException(a.j(i2, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return i;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartSessionResponse) {
            StartSessionResponse startSessionResponse = (StartSessionResponse) obj;
            if (arwb.b(Integer.valueOf(this.b), Integer.valueOf(startSessionResponse.b)) && arwb.b(Integer.valueOf(this.c), Integer.valueOf(startSessionResponse.c)) && arwb.b(this.f, startSessionResponse.f) && arwb.b(this.d, startSessionResponse.d) && arwb.b(this.e, startSessionResponse.e) && arwb.b(this.f, startSessionResponse.f) && arwb.b(this.g, startSessionResponse.g) && arwb.b(this.h, startSessionResponse.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 4:
                this.d = str2;
                break;
            case 5:
                this.e = str2;
                break;
            case 6:
                if (str2 != null) {
                    this.f = str2;
                    break;
                } else {
                    return;
                }
            case 7:
                this.g = str2;
                break;
            case 8:
                this.h = str2;
                break;
            default:
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a string."));
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.b = i2;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException(a.l(i3, "Field with id=", " is not known to be an int."));
            }
            this.c = i2;
        }
        this.a.add(Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h});
    }

    public final void p(String str) {
        this.a.add(8);
        this.h = str;
    }

    public final void q(String str) {
        this.a.add(6);
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            arxc.v(parcel, 8, this.h, true);
        }
        arxc.c(parcel, a);
    }

    public StartSessionResponse() {
        this.a = new HashSet();
    }
}
