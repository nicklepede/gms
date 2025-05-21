package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cesj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class OauthRedirect extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cesj();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public OauthRedirect() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OauthRedirect) {
            OauthRedirect oauthRedirect = (OauthRedirect) obj;
            if (arwb.b(this.a, oauthRedirect.a) && arwb.b(this.b, oauthRedirect.b) && arwb.b(this.c, oauthRedirect.c) && arwb.b(this.d, oauthRedirect.d) && arwb.b(this.e, oauthRedirect.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public OauthRedirect(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
