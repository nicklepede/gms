package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bdnf;
import defpackage.bdya;
import defpackage.bdyb;
import defpackage.bdyc;
import defpackage.ekus;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class TokenBinding extends AbstractSafeParcelable implements bdnf {
    public static final Parcelable.Creator CREATOR = new bdyc();
    public final TokenBindingStatus a;
    public final String b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator CREATOR = new bdya();
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
            throw new bdyb(str);
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
        atzb.s(str);
        try {
            this.a = TokenBindingStatus.a(str);
            this.b = str2;
        } catch (bdyb e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // defpackage.bdnf
    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        return ekus.a(this.a, tokenBinding.a) && ekus.a(this.b, tokenBinding.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a.d;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.v(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}
