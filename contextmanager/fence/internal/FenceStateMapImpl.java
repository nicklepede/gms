package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.atzs;
import defpackage.avtn;
import java.util.HashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new avtn();
    public final Map a;

    public FenceStateMapImpl(Map map) {
        this.a = map;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        Map map = this.a;
        int a = atzr.a(parcel);
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : map.entrySet()) {
                bundle2.putByteArray((String) entry.getKey(), atzs.n((FenceStateImpl) entry.getValue()));
            }
            bundle = bundle2;
        }
        atzr.g(parcel, 2, bundle, false);
        atzr.c(parcel, a);
    }

    public FenceStateMapImpl(Bundle bundle) {
        this.a = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Map map = this.a;
                byte[] byteArray = bundle.getByteArray(str);
                atzb.s(byteArray);
                map.put(str, (FenceStateImpl) atzs.a(byteArray, FenceStateImpl.CREATOR));
            }
        }
    }
}
