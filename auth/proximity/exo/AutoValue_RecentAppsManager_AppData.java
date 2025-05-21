package com.google.android.gms.auth.proximity.exo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import defpackage.acik;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AutoValue_RecentAppsManager_AppData extends C$AutoValue_RecentAppsManager_AppData {
    public static final Parcelable.Creator CREATOR = new acik();

    public AutoValue_RecentAppsManager_AppData(ProtoParsers$ParcelableProto protoParsers$ParcelableProto, long j, UserHandle userHandle) {
        super(protoParsers$ParcelableProto, j, userHandle);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeLong(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
