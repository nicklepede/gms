package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bbji;
import defpackage.bbuj;
import defpackage.bbuk;
import defpackage.bbul;
import defpackage.eihn;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TokenBinding extends AbstractSafeParcelable implements bbji {
    public static final Parcelable.Creator CREATOR = new bbul();
    public final TokenBindingStatus a;
    public final String b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator CREATOR = new bbuj();
        public final String d;

        TokenBindingStatus(String str) {
            this.d = str;
        }

        public static TokenBindingStatus a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.d)) {
                    return tokenBindingStatus;
                }
            }
            throw new bbuk(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
        }
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.d, null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.d, null);
    }

    public TokenBinding(String str, String str2) {
        arwm.s(str);
        try {
            this.a = TokenBindingStatus.a(str);
            this.b = str2;
        } catch (bbuk e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return eihn.a(this.a, tokenBinding.a) && eihn.a(this.b, tokenBinding.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.d;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
