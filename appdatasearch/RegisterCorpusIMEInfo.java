package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.trx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new trx();
    public final int a;
    public final String[] b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        return this.a == registerCorpusIMEInfo.a && Arrays.equals(this.b, registerCorpusIMEInfo.b) && arwb.b(this.c, registerCorpusIMEInfo.c) && arwb.b(this.d, registerCorpusIMEInfo.d) && Arrays.equals(this.e, registerCorpusIMEInfo.e) && arwb.b(this.f, registerCorpusIMEInfo.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.w(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.w(parcel, 7, this.e, false);
        arxc.c(parcel, a);
    }
}
