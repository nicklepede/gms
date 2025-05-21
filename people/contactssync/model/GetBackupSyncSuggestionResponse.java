package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ctwn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GetBackupSyncSuggestionResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ctwn();
    public final int a;
    public final String b;
    public final BackupSyncContactInfo c;

    public GetBackupSyncSuggestionResponse(int i, String str, BackupSyncContactInfo backupSyncContactInfo) {
        this.a = i;
        this.b = str;
        this.c = backupSyncContactInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}
