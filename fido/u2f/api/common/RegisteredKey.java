package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdnf;
import defpackage.besh;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class RegisteredKey extends AbstractSafeParcelable implements bdnf {
    public static final Parcelable.Creator CREATOR = new besh();
    public final KeyHandle a;
    public final String b;
    public String c;

    public RegisteredKey(KeyHandle keyHandle) {
        this(keyHandle, null, null);
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.c;
        if (str == null) {
            if (registeredKey.c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.c)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (registeredKey.b != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.a.hashCode();
        String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            KeyHandle keyHandle = this.a;
            jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.b, 11));
            ProtocolVersion protocolVersion = keyHandle.c;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                jSONObject.put("version", protocolVersion.d);
            }
            List list = keyHandle.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        KeyHandle keyHandle = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, keyHandle, i, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.b, false);
        atzr.c(parcel, a);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        atzb.s(keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }
}
