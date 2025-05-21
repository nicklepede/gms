package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.djiz;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new djiz();

    @Deprecated
    String a;

    @Deprecated
    String b;
    public final ArrayList c;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, this.a, false);
        arxc.v(parcel, 3, this.b, false);
        arxc.y(parcel, 4, this.c, false);
        arxc.c(parcel, a);
    }

    LabelValueRow() {
        this.c = new ArrayList();
    }
}
