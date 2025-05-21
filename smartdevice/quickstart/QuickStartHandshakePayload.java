package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.data.SourceDeviceInfo;
import com.google.android.gms.smartdevice.d2d.data.TargetDeviceInfo;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.ddwb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QuickStartHandshakePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddwb();
    private static final HashMap g;
    public final Set a;
    public long b;
    public TargetDeviceInfo c;
    public SourceDeviceInfo d;
    public RestoreAnytimeContext e;
    public QuickStartHandshakeOptionFlags f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("sessionId", new FastJsonResponse$Field(2, false, 2, false, "sessionId", 1, null));
        hashMap.put("targetDeviceInfo", new FastJsonResponse$Field(11, false, 11, false, "targetDeviceInfo", 2, TargetDeviceInfo.class));
        hashMap.put("sourceDeviceInfo", new FastJsonResponse$Field(11, false, 11, false, "sourceDeviceInfo", 3, SourceDeviceInfo.class));
        hashMap.put("restoreAnytimeContext", new FastJsonResponse$Field(11, false, 11, false, "restoreAnytimeContext", 4, RestoreAnytimeContext.class));
        hashMap.put("handshakeOptionFlags", new FastJsonResponse$Field(11, false, 11, false, "handshakeOptionFlags", 5, QuickStartHandshakeOptionFlags.class));
    }

    public QuickStartHandshakePayload(Set set, long j, TargetDeviceInfo targetDeviceInfo, SourceDeviceInfo sourceDeviceInfo, RestoreAnytimeContext restoreAnytimeContext, QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags) {
        this.a = set;
        this.b = j;
        this.c = targetDeviceInfo;
        this.d = sourceDeviceInfo;
        this.e = restoreAnytimeContext;
        this.f = quickStartHandshakeOptionFlags;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Long.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        if (i == 4) {
            return this.e;
        }
        if (i == 5) {
            return this.f;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final Map b() {
        return g;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.c = (TargetDeviceInfo) ashsVar;
        } else if (i == 3) {
            this.d = (SourceDeviceInfo) ashsVar;
        } else if (i == 4) {
            this.e = (RestoreAnytimeContext) ashsVar;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
            }
            this.f = (QuickStartHandshakeOptionFlags) ashsVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 1) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
        }
        this.b = j;
        this.a.add(Integer.valueOf(i));
    }

    public final void p(QuickStartHandshakeOptionFlags quickStartHandshakeOptionFlags) {
        this.f = quickStartHandshakeOptionFlags;
        this.a.add(5);
    }

    public final void q(RestoreAnytimeContext restoreAnytimeContext) {
        this.e = restoreAnytimeContext;
        this.a.add(4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.q(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            arxc.t(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            arxc.t(parcel, 3, this.d, i, true);
        }
        if (set.contains(4)) {
            arxc.t(parcel, 4, this.e, i, true);
        }
        if (set.contains(5)) {
            arxc.t(parcel, 5, this.f, i, true);
        }
        arxc.c(parcel, a);
    }

    public QuickStartHandshakePayload() {
        this.a = new HashSet();
    }
}
