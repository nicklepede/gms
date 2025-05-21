package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcvo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AuthenticatingUser extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcvo();
    private static final HashMap d;
    public final Set a;
    public String b;
    public String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("obfuscatedGaiaID", new FastJsonResponse$Field(7, false, 7, false, "obfuscatedGaiaID", 2, null));
        hashMap.put("email", new FastJsonResponse$Field(7, false, 7, false, "email", 3, null));
    }

    public AuthenticatingUser(Set set, String str, String str2) {
        this.a = set;
        this.b = str;
        this.c = str2;
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
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return d;
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
        if (i == 2) {
            this.b = str2;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.c = str2;
        }
        this.a.add(Integer.valueOf(i));
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
        arxc.c(parcel, a);
    }

    public AuthenticatingUser() {
        this.a = new HashSet();
    }
}
