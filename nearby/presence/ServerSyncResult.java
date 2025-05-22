package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cmtb;
import defpackage.cmtc;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ServerSyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmtc();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;
    public final String f;
    public final int g;

    public ServerSyncResult(int i, int i2, int i3, int i4, List list, String str, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = list;
        this.f = str;
        this.g = i5;
    }

    public static cmtb a(int i) {
        cmtb cmtbVar = new cmtb();
        cmtbVar.a = i;
        cmtbVar.b = i;
        cmtbVar.c = i;
        cmtbVar.d = i;
        return cmtbVar;
    }

    public final cmtb b() {
        cmtb cmtbVar = new cmtb();
        cmtbVar.a = this.a;
        cmtbVar.b = this.b;
        cmtbVar.c = this.c;
        cmtbVar.d = this.d;
        cmtbVar.e = this.g;
        List list = this.e;
        if (list != null) {
            cmtbVar.f = list;
        }
        String str = this.f;
        if (str != null) {
            cmtbVar.g = str;
        }
        return cmtbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.y(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.o(parcel, 7, this.g);
        atzr.c(parcel, a);
    }
}
