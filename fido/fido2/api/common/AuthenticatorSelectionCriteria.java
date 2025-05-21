package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bbrv;
import defpackage.bbsl;
import defpackage.bbuf;
import defpackage.bbup;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbsl();
    public final Attachment a;
    public final Boolean b;
    public final UserVerificationRequirement c;
    public final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a = null;
        } else {
            try {
                a = Attachment.a(str);
            } catch (bbrv | bbuf | bbup e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirement;
    }

    public static AuthenticatorSelectionCriteria a(JSONObject jSONObject) {
        return new AuthenticatorSelectionCriteria(jSONObject.has("authenticatorAttachment") ? jSONObject.optString("authenticatorAttachment") : null, jSONObject.has("requireResidentKey") ? Boolean.valueOf(jSONObject.optBoolean("requireResidentKey")) : null, jSONObject.has("userVerification") ? jSONObject.optString("userVerification") : null, jSONObject.has("residentKey") ? jSONObject.optString("residentKey") : null);
    }

    public final ResidentKeyRequirement b() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.b;
        return (bool == null || !bool.booleanValue()) ? ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED : ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final String c() {
        Attachment attachment = this.a;
        if (attachment == null) {
            return null;
        }
        return attachment.c;
    }

    public final String d() {
        UserVerificationRequirement userVerificationRequirement = this.c;
        if (userVerificationRequirement == null) {
            return null;
        }
        return userVerificationRequirement.d;
    }

    public final String e() {
        ResidentKeyRequirement b = b();
        if (b == null) {
            return null;
        }
        return b.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return arwb.b(this.a, authenticatorSelectionCriteria.a) && arwb.b(this.b, authenticatorSelectionCriteria.b) && arwb.b(this.c, authenticatorSelectionCriteria.c) && arwb.b(b(), authenticatorSelectionCriteria.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        UserVerificationRequirement userVerificationRequirement = this.c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.a) + ", \n requireResidentKey=" + this.b + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, c(), false);
        arxc.z(parcel, 3, this.b);
        arxc.v(parcel, 4, d(), false);
        arxc.v(parcel, 5, e(), false);
        arxc.c(parcel, a);
    }
}
