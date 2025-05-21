package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.cked;
import defpackage.ckef;
import defpackage.ckfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UnpublishRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckfp();
    final int a;
    public final MessageWrapper b;
    public final ckef c;

    @Deprecated
    public final String d;

    @Deprecated
    public final String e;

    @Deprecated
    public final boolean f;

    @Deprecated
    public final ClientAppContext g;

    public UnpublishRequest(int i, MessageWrapper messageWrapper, IBinder iBinder, String str, String str2, boolean z, ClientAppContext clientAppContext) {
        ckef ckedVar;
        this.a = i;
        this.b = messageWrapper;
        if (iBinder == null) {
            ckedVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
            ckedVar = queryLocalInterface instanceof ckef ? (ckef) queryLocalInterface : new cked(iBinder);
        }
        this.c = ckedVar;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = ClientAppContext.b(clientAppContext, str2, str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.D(parcel, 3, this.c.asBinder());
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.e(parcel, 6, this.f);
        arxc.t(parcel, 7, this.g, i, false);
        arxc.c(parcel, a);
    }
}
