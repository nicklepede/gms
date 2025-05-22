package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlbo;
import defpackage.dlbp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlbp();
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    private GetSaveInstrumentDetailsResponse() {
    }

    public static dlbo a() {
        return new dlbo(new GetSaveInstrumentDetailsResponse());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.w(parcel, 1, this.a, false);
        atzr.p(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }
}
