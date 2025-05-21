package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.didg;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new didg();
    public ArrayList a;
    public final boolean b;
    public boolean c;
    public int d;

    private CardRequirements() {
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.E(parcel, 1, this.a);
        arxc.e(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.c(parcel, a);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
