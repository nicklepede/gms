package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwg();
    public final String a;
    public final int[] b;
    public final int c;
    public final String[] d;

    public BackupAndSyncOptInState(String str, int[] iArr, int i, String[] strArr) {
        this.a = str;
        this.b = iArr;
        this.c = i;
        this.d = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.p(parcel, 2, this.b, false);
        arxc.o(parcel, 4, this.c);
        arxc.w(parcel, 5, this.d, false);
        arxc.c(parcel, a);
    }
}
