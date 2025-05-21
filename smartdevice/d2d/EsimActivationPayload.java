package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcxm;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EsimActivationPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcxm();
    private static final HashMap g;
    final Set a;
    public int b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("resultCode", new FastJsonResponse$Field(0, false, 0, false, "resultCode", 2, null));
        hashMap.put("activationCode", new FastJsonResponse$Field(7, false, 7, false, "activationCode", 3, null));
        hashMap.put("phoneNumber", new FastJsonResponse$Field(7, false, 7, false, "phoneNumber", 4, null));
        hashMap.put("carrierName", new FastJsonResponse$Field(7, false, 7, false, "carrierName", 5, null));
        hashMap.put("isEmbedded", new FastJsonResponse$Field(6, false, 6, false, "isEmbedded", 6, null));
    }

    public EsimActivationPayload(Set set, int i, String str, String str2, String str3, boolean z) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Integer.valueOf(this.b);
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
            return Boolean.valueOf(this.f);
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
        if (i == 3) {
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
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 6) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
        }
        this.f = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be an integer.", Integer.valueOf(i2)));
        }
        this.b = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
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
            arxc.e(parcel, 6, this.f);
        }
        arxc.c(parcel, a);
    }

    public EsimActivationPayload() {
        this.a = new HashSet();
        this.b = 1;
    }

    public EsimActivationPayload(String str, String str2, String str3, boolean z) {
        this();
        this.b = 0;
        this.a.add(2);
        this.c = str;
        this.a.add(3);
        this.d = str2;
        this.a.add(4);
        this.e = str3;
        this.a.add(5);
        this.f = z;
        this.a.add(6);
    }
}
