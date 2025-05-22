package com.google.android.gms.wallet.webview;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dluo;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WebViewWidgetResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dluo();
    public final byte[] a;

    public WebViewWidgetResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.a, ((WebViewWidgetResult) obj).a);
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }

    public WebViewWidgetResult(Parcel parcel) {
        this.a = parcel.createByteArray();
    }
}
