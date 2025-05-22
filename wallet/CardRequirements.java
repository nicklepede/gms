package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dkor;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkor();
    public ArrayList a;
    public final boolean b;
    public boolean c;
    public int d;

    private CardRequirements() {
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.E(parcel, 1, this.a);
        atzr.e(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.c(parcel, a);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
