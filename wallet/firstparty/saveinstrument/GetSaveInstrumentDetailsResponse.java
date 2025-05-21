package com.google.android.gms.wallet.firstparty.saveinstrument;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.diqd;
import defpackage.diqe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetSaveInstrumentDetailsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new diqe();
    public String[] a;
    public int[] b;
    public RemoteViews c;
    public byte[] d;

    private GetSaveInstrumentDetailsResponse() {
    }

    public static diqd a() {
        return new diqd(new GetSaveInstrumentDetailsResponse());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.w(parcel, 1, this.a, false);
        arxc.p(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public GetSaveInstrumentDetailsResponse(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }
}
