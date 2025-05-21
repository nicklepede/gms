package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcye;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PostTransferAction extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcye();
    private static final HashMap g;
    public final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public long f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("uri", new FastJsonResponse$Field(7, false, 7, false, "uri", 2, null));
        hashMap.put("wifiD2D", new FastJsonResponse$Field(7, false, 7, false, "wifiD2D", 3, null));
        hashMap.put("OEM", new FastJsonResponse$Field(7, false, 7, false, "OEM", 4, null));
        hashMap.put("OEM_package", new FastJsonResponse$Field(7, false, 7, false, "OEM_package", 5, null));
        hashMap.put("target_OEM_package_version", new FastJsonResponse$Field(2, false, 2, false, "target_OEM_package_version", 6, null));
    }

    public PostTransferAction(Set set, String str, String str2, String str3, String str4, long j) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return this.d;
        }
        if (i == 5) {
            return this.e;
        }
        if (i == 6) {
            return Long.valueOf(this.f);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return g;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = str2;
        } else if (i == 3) {
            this.c = str2;
        } else if (i == 4) {
            this.d = str2;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 6) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a long.", Integer.valueOf(i)));
        }
        this.f = j;
        this.a.add(6);
    }

    public final void p(String str) {
        this.d = str;
        this.a.add(4);
    }

    public final void q(String str) {
        this.c = str;
        this.a.add(3);
    }

    public final void r(String str) {
        this.e = str;
        this.a.add(5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.q(parcel, 6, this.f);
        }
        arxc.c(parcel, a);
    }

    public PostTransferAction() {
        this.f = 0L;
        this.a = new HashSet();
    }
}
