package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cdza;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ActionTile extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cdza();
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
        if (arwb.b(this.a, actionTile.a) && arwb.b(this.b, actionTile.b)) {
            String str = this.c;
            String str2 = actionTile.c;
            if (arwb.b(str, str2) && arwb.b(str, str2) && arwb.b(this.d, actionTile.d) && arwb.b(this.e, actionTile.e)) {
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
        arwa.b("tileId", this.a, arrayList);
        arwa.b("title", this.b, arrayList);
        arwa.b("description", this.c, arrayList);
        arwa.b("landingPageUri", this.d, arrayList);
        arwa.b("buttonText", this.e, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int a = arxc.a(parcel);
        arxc.I(parcel, 1, l);
        arxc.v(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }
}
