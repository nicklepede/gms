package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.aeov;
import defpackage.atqs;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GetMyDevicesResponseEntity extends FastSafeParcelableJsonResponse implements atqs {
    public static final Parcelable.Creator CREATOR = new aeov();
    private static final HashMap c;
    final Set a;
    public List b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("devices", new FastJsonResponse$Field(11, true, 11, true, "devices", 2, ExternalDeviceInfoEntity.class));
    }

    public GetMyDevicesResponseEntity(Set set, List list) {
        this.a = set;
        this.b = list;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return c;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof GetMyDevicesResponseEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        GetMyDevicesResponseEntity getMyDevicesResponseEntity = (GetMyDevicesResponseEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!getMyDevicesResponseEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(getMyDevicesResponseEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (getMyDevicesResponseEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
        }
        this.b = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.y(parcel, 2, this.b, true);
        }
        atzr.c(parcel, a);
    }

    public GetMyDevicesResponseEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
