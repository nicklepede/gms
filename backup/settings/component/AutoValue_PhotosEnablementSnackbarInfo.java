package com.google.android.gms.backup.settings.component;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alkz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutoValue_PhotosEnablementSnackbarInfo extends C$AutoValue_PhotosEnablementSnackbarInfo {
    public static final Parcelable.Creator CREATOR = new alkz();

    public AutoValue_PhotosEnablementSnackbarInfo(boolean z, Intent intent, PendingIntent pendingIntent, String str) {
        super(z, intent, pendingIntent, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        String str = this.d;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
    }
}
