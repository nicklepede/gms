package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.acov;
import defpackage.arod;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GetMyDevicesResponseEntity extends FastSafeParcelableJsonResponse implements arod {
    public static final Parcelable.Creator CREATOR = new acov();
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

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return c;
    }

    @Override // defpackage.ashs
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

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.F(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
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
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.y(parcel, 2, this.b, true);
        }
        arxc.c(parcel, a);
    }

    public GetMyDevicesResponseEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}
