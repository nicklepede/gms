package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cgih;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ActionTile extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cgih();
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ActionTile(Long l, String str, String str2, String str3, String str4) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionTile)) {
            return false;
        }
        ActionTile actionTile = (ActionTile) obj;
        if (atyq.b(this.a, actionTile.a) && atyq.b(this.b, actionTile.b)) {
            String str = this.c;
            String str2 = actionTile.c;
            if (atyq.b(str, str2) && atyq.b(str, str2) && atyq.b(this.d, actionTile.d) && atyq.b(this.e, actionTile.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("tileId", this.a, arrayList);
        atyp.b("title", this.b, arrayList);
        atyp.b("description", this.c, arrayList);
        atyp.b("landingPageUri", this.d, arrayList);
        atyp.b("buttonText", this.e, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = atzr.a(parcel);
        atzr.I(parcel, 1, l);
        atzr.v(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }
}
