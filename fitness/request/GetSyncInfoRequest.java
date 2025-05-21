package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.bgix;
import defpackage.bgla;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GetSyncInfoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgla();
    public final bgix a;

    public GetSyncInfoRequest(bgix bgixVar) {
        this.a = bgixVar;
    }

    public final String toString() {
        return String.format(Locale.US, "GetSyncInfoRequest {%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.a);
        arxc.c(parcel, a);
    }

    public GetSyncInfoRequest(IBinder iBinder) {
        bgix bgixVar;
        if (iBinder == null) {
            bgixVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISyncInfoCallback");
            bgixVar = queryLocalInterface instanceof bgix ? (bgix) queryLocalInterface : new bgix(iBinder);
        }
        this.a = bgixVar;
    }
}
