package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.arxd;
import defpackage.atpk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new atpk();
    public final Map a;

    public FenceStateMapImpl(Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        Map map = this.a;
        int a = arxc.a(parcel);
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putByteArray((String) entry.getKey(), arxd.n((FenceStateImpl) entry.getValue()));
            }
            bundle = bundle2;
        }
        arxc.g(parcel, 2, bundle, false);
        arxc.c(parcel, a);
    }

    public FenceStateMapImpl(Bundle bundle) {
        this.a = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Map map = this.a;
                byte[] byteArray = bundle.getByteArray(str);
                arwm.s(byteArray);
                map.put(str, (FenceStateImpl) arxd.a(byteArray, FenceStateImpl.CREATOR));
            }
        }
    }
}
