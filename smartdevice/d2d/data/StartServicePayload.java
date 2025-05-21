package com.google.android.gms.smartdevice.d2d.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.ddge;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class StartServicePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddge();
    private static final HashMap f;
    public final Set a;
    public String b;
    public Bundle c;
    public StartServiceResponse d;
    public String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("packageName", new FastJsonResponse$Field(7, false, 7, false, "packageName", 1, null));
        hashMap.put("extraParameters", new FastJsonResponse$Field(10, false, 10, false, "extraParameters", 3, null));
        hashMap.put("startServiceResponse", new FastJsonResponse$Field(11, false, 11, false, "startServiceResponse", 4, StartServiceResponse.class));
        hashMap.put("action", new FastJsonResponse$Field(7, false, 7, false, "action", 5, null));
    }

    public StartServicePayload(Set set, String str, Bundle bundle, StartServiceResponse startServiceResponse, String str2) {
        this.a = set;
        this.b = str;
        this.c = bundle;
        this.d = startServiceResponse;
        this.e = str2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return this.b;
        }
        if (i != 3) {
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                hashMap.put(str, string);
            }
        }
        return hashMap;
    }

    @Override // defpackage.ashs
    protected final void ae(FastJsonResponse$Field fastJsonResponse$Field, String str, Map map) {
        Bundle bundle;
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string map.", Integer.valueOf(i)));
        }
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            for (String str2 : map.keySet()) {
                bundle2.putString(str2, (String) map.get(str2));
            }
            bundle = bundle2;
        }
        this.c = bundle;
        Set set = this.a;
        set.add(3);
        set.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return f;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            this.b = str2;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d not a concrete type", Integer.valueOf(i)));
        }
        this.d = (StartServiceResponse) ashsVar;
        this.a.add(Integer.valueOf(i));
    }

    public final void p(String str) {
        arwm.r(str, "action cannot be null or empty.");
        this.e = str;
        this.a.add(5);
    }

    public final void q(String str) {
        arwm.r(str, "packageName cannot be null or empty.");
        this.b = str;
        this.a.add(1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.v(parcel, 1, this.b, true);
        }
        if (set.contains(3)) {
            arxc.g(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.t(parcel, 4, this.d, i, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        arxc.c(parcel, a);
    }

    public StartServicePayload() {
        this.a = new HashSet();
    }
}
