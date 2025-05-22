package com.google.android.gms.autofill.service.common;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.util.CardNetwork;
import defpackage.ahwu;
import defpackage.ajgc;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auub;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.fnvd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ClientStateParcelable implements ClientState {
    public byte[] b = new byte[0];
    public CardNetwork[] c = new CardNetwork[0];
    public DetectionHistory d = new DetectionHistory();
    public MetricsContext e = null;
    public ekvi f;
    public ekvi g;
    public static final ausn a = ausn.b("ClientStateParcelable", auid.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new ahwu();

    public ClientStateParcelable() {
        ektg ektgVar = ektg.a;
        this.f = ektgVar;
        this.g = ektgVar;
    }

    public static ClientState a(Bundle bundle) {
        if (bundle == null) {
            return new ClientStateParcelable();
        }
        try {
            Bundle bundle2 = (Bundle) ajgc.b(bundle);
            if (bundle2 == null) {
                return new ClientStateParcelable();
            }
            ClassLoader classLoader = ClientStateParcelable.class.getClassLoader();
            if (classLoader == null) {
                return new ClientStateParcelable();
            }
            bundle2.setClassLoader(classLoader);
            try {
                ClientStateParcelable clientStateParcelable = (ClientStateParcelable) ajgc.b(bundle2);
                return clientStateParcelable == null ? new ClientStateParcelable() : clientStateParcelable;
            } catch (OutOfMemoryError unused) {
                ((eluo) ((eluo) a.i()).ai((char) 1187)).x("Failed to unbundle client state.");
                return new ClientStateParcelable();
            }
        } catch (BadParcelableException | IllegalStateException | NullPointerException | OutOfMemoryError e) {
            ((eluo) ((eluo) ((eluo) a.h()).s(e)).ai((char) 1188)).x("Failed to unbundle client state.");
            return new ClientStateParcelable();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeTypedObject(this.d, i);
        MetricsContext metricsContext = this.e;
        parcel.writeInt(metricsContext == null ? 0 : 1);
        if (metricsContext != null) {
            parcel.writeParcelable(metricsContext, i);
        }
        if (auub.g()) {
            parcel.writeByte(this.f.h() ? (byte) 1 : (byte) 0);
            if (this.f.h()) {
                parcel.writeParcelable((Parcelable) this.f.c(), i);
            }
        }
        if (fnvd.n()) {
            parcel.writeByte(this.g.h() ? (byte) 1 : (byte) 0);
            if (this.g.h()) {
                parcel.writeString((String) this.g.c());
            }
        }
    }
}
