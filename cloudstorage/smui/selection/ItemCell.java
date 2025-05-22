package com.google.android.gms.cloudstorage.smui.selection;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aspj;
import defpackage.fjok;
import defpackage.fjos;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ItemCell implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aspj();
    public final fjok a;
    public final fjos b;

    public ItemCell(fjok fjokVar, fjos fjosVar) {
        fxxm.f(fjokVar, "smuiCategory");
        fxxm.f(fjosVar, "smuiItem");
        this.a = fjokVar;
        this.b = fjosVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemCell)) {
            return false;
        }
        ItemCell itemCell = (ItemCell) obj;
        return fxxm.n(this.a, itemCell.a) && fxxm.n(this.b, itemCell.b);
    }

    public final int hashCode() {
        int i;
        int i2;
        fjok fjokVar = this.a;
        if (fjokVar.L()) {
            i = fjokVar.s();
        } else {
            int i3 = fjokVar.bJ;
            if (i3 == 0) {
                i3 = fjokVar.s();
                fjokVar.bJ = i3;
            }
            i = i3;
        }
        fjos fjosVar = this.b;
        if (fjosVar.L()) {
            i2 = fjosVar.s();
        } else {
            int i4 = fjosVar.bJ;
            if (i4 == 0) {
                i4 = fjosVar.s();
                fjosVar.bJ = i4;
            }
            i2 = i4;
        }
        return (i * 31) + i2;
    }

    public final String toString() {
        return "ItemCell(smuiCategory=" + this.a + ", smuiItem=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        fxxm.f(parcel, "parcel");
        fjok fjokVar = this.a;
        parcel.writeByteArray(fjokVar != null ? fjokVar.r() : null);
        fjos fjosVar = this.b;
        fxxm.f(parcel, "parcel");
        parcel.writeByteArray(fjosVar != null ? fjosVar.r() : null);
    }

    public ItemCell() {
        this(fjok.a, fjos.a);
    }
}
