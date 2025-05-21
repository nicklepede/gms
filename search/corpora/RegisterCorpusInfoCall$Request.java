package com.google.android.gms.search.corpora;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cymf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RegisterCorpusInfoCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cymf();
    public String a;
    public String b;
    public RegisterCorpusInfo c;

    public RegisterCorpusInfoCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, this.a, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }

    public RegisterCorpusInfoCall$Request(String str, String str2, RegisterCorpusInfo registerCorpusInfo) {
        this.a = str;
        this.b = str2;
        this.c = registerCorpusInfo;
    }
}
