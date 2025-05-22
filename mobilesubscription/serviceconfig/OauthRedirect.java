package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.chbr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class OauthRedirect extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new chbr();
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
            if (atyq.b(this.a, oauthRedirect.a) && atyq.b(this.b, oauthRedirect.b) && atyq.b(this.c, oauthRedirect.c) && atyq.b(this.d, oauthRedirect.d) && atyq.b(this.e, oauthRedirect.e)) {
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, this.a, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public OauthRedirect(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }
}
