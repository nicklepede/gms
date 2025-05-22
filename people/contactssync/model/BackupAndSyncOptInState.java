package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cwfm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BackupAndSyncOptInState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cwfm();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.p(parcel, 2, this.b, false);
        atzr.o(parcel, 4, this.c);
        atzr.w(parcel, 5, this.d, false);
        atzr.c(parcel, a);
    }
}
