package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ckkw;
import defpackage.ckkx;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ServerSyncResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckkx();
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

    public static ckkw a(int i) {
        ckkw ckkwVar = new ckkw();
        ckkwVar.a = i;
        ckkwVar.b = i;
        ckkwVar.c = i;
        ckkwVar.d = i;
        return ckkwVar;
    }

    public final ckkw b() {
        ckkw ckkwVar = new ckkw();
        ckkwVar.a = this.a;
        ckkwVar.b = this.b;
        ckkwVar.c = this.c;
        ckkwVar.d = this.d;
        ckkwVar.e = this.g;
        List list = this.e;
        if (list != null) {
            ckkwVar.f = list;
        }
        String str = this.f;
        if (str != null) {
            ckkwVar.g = str;
        }
        return ckkwVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.y(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.o(parcel, 7, this.g);
        arxc.c(parcel, a);
    }
}
