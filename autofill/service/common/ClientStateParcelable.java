package com.google.android.gms.autofill.service.common;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.autofill.metrics.MetricsContext;
import com.google.android.gms.autofill.util.CardNetwork;
import defpackage.afwf;
import defpackage.ahfm;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.fldt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ClientStateParcelable implements ClientState {
    public byte[] b = new byte[0];
    public CardNetwork[] c = new CardNetwork[0];
    public DetectionHistory d = new DetectionHistory();
    public MetricsContext e = null;
    public eiid f;
    public eiid g;
    public static final asot a = asot.b("ClientStateParcelable", asej.AUTOFILL);
    public static final Parcelable.Creator CREATOR = new afwf();

    public ClientStateParcelable() {
        eigb eigbVar = eigb.a;
        this.f = eigbVar;
        this.g = eigbVar;
    }

    public static ClientState a(Bundle bundle) {
        if (bundle == null) {
            return new ClientStateParcelable();
        }
        try {
            Bundle bundle2 = (Bundle) ahfm.b(bundle);
            if (bundle2 == null) {
                return new ClientStateParcelable();
            }
            ClassLoader classLoader = ClientStateParcelable.class.getClassLoader();
            if (classLoader == null) {
                return new ClientStateParcelable();
            }
            bundle2.setClassLoader(classLoader);
            try {
                ClientStateParcelable clientStateParcelable = (ClientStateParcelable) ahfm.b(bundle2);
                return clientStateParcelable == null ? new ClientStateParcelable() : clientStateParcelable;
            } catch (OutOfMemoryError unused) {
                ((ejhf) ((ejhf) a.i()).ah((char) 1183)).x("Failed to unbundle client state.");
                return new ClientStateParcelable();
            }
        } catch (BadParcelableException | IllegalStateException | NullPointerException | OutOfMemoryError e) {
            ((ejhf) ((ejhf) ((ejhf) a.h()).s(e)).ah((char) 1184)).x("Failed to unbundle client state.");
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
        if (asqh.g()) {
            parcel.writeByte(this.f.h() ? (byte) 1 : (byte) 0);
            if (this.f.h()) {
                parcel.writeParcelable((Parcelable) this.f.c(), i);
            }
        }
        if (fldt.n()) {
            parcel.writeByte(this.g.h() ? (byte) 1 : (byte) 0);
            if (this.g.h()) {
                parcel.writeString((String) this.g.c());
            }
        }
    }
}
