package com.google.android.gms.googleone.smui.selection;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bjpc;
import defpackage.fgze;
import defpackage.fgzm;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ItemCell implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bjpc();
    public final fgze a;
    public final fgzm b;

    public ItemCell(fgze fgzeVar, fgzm fgzmVar) {
        fvbo.f(fgzeVar, "smuiCategory");
        fvbo.f(fgzmVar, "smuiItem");
        this.a = fgzeVar;
        this.b = fgzmVar;
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
        return fvbo.n(this.a, itemCell.a) && fvbo.n(this.b, itemCell.b);
    }

    public final int hashCode() {
        int i;
        int i2;
        fgze fgzeVar = this.a;
        if (fgzeVar.L()) {
            i = fgzeVar.s();
        } else {
            int i3 = fgzeVar.bH;
            if (i3 == 0) {
                i3 = fgzeVar.s();
                fgzeVar.bH = i3;
            }
            i = i3;
        }
        fgzm fgzmVar = this.b;
        if (fgzmVar.L()) {
            i2 = fgzmVar.s();
        } else {
            int i4 = fgzmVar.bH;
            if (i4 == 0) {
                i4 = fgzmVar.s();
                fgzmVar.bH = i4;
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
        fvbo.f(parcel, "dest");
        fvbo.f(parcel, "parcel");
        fgze fgzeVar = this.a;
        parcel.writeByteArray(fgzeVar != null ? fgzeVar.r() : null);
        fgzm fgzmVar = this.b;
        fvbo.f(parcel, "parcel");
        parcel.writeByteArray(fgzmVar != null ? fgzmVar.r() : null);
    }

    public ItemCell() {
        this(fgze.a, fgzm.a);
    }
}
