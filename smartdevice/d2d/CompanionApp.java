package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfhx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CompanionApp extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfhx();
    private static final HashMap g;
    final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("appName", new FastJsonResponse$Field(7, false, 7, false, "appName", 2, null));
        hashMap.put("packageName", new FastJsonResponse$Field(7, false, 7, false, "packageName", 3, null));
        hashMap.put("installTitle", new FastJsonResponse$Field(7, false, 7, false, "installTitle", 4, null));
        hashMap.put("installMessage", new FastJsonResponse$Field(7, false, 7, false, "installMessage", 5, null));
        hashMap.put("isOptional", new FastJsonResponse$Field(6, false, 6, false, "isOptional", 6, null));
    }

    public CompanionApp(Set set, String str, String str2, String str3, String str4, boolean z) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    @Override // defpackage.aulm
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
            return Boolean.valueOf(this.f);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return g;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
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

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 6) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a boolean.", Integer.valueOf(i)));
        }
        this.f = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.e(parcel, 6, this.f);
        }
        atzr.c(parcel, a);
    }

    public CompanionApp() {
        this.a = new HashSet();
    }
}
