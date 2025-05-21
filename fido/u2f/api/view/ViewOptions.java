package com.google.android.gms.fido.u2f.api.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import defpackage.arxc;
import defpackage.bbji;
import defpackage.bcsm;
import defpackage.bcsn;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ViewOptions extends AbstractSafeParcelable implements bbji {
    public static final Parcelable.Creator CREATOR = new bcsn();
    private final int a;
    public Boolean c;

    public ViewOptions(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.fido.u2f.api.view.ViewOptions f(org.json.JSONObject r8) {
        /*
            java.lang.String r0 = "viewName"
            java.lang.String r0 = r8.getString(r0)     // Catch: defpackage.bcsl -> Lac
            bcsm[] r1 = defpackage.bcsm.values()     // Catch: defpackage.bcsl -> Lac
            int r2 = r1.length     // Catch: defpackage.bcsl -> Lac
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto La6
            r5 = r1[r4]     // Catch: defpackage.bcsl -> Lac
            java.lang.String r6 = r5.j     // Catch: defpackage.bcsl -> Lac
            boolean r7 = r0.equals(r6)     // Catch: defpackage.bcsl -> Lac
            if (r7 == 0) goto La2
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L75;
                case 1: goto L55;
                case 2: goto L4f;
                case 3: goto L49;
                case 4: goto L43;
                case 5: goto L3d;
                case 6: goto L20;
                case 7: goto L37;
                case 8: goto L31;
                default: goto L20;
            }
        L20:
            org.json.JSONException r8 = new org.json.JSONException
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r3] = r6
            java.lang.String r1 = "View %s unimplemented"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r8.<init>(r0)
            throw r8
        L31:
            com.google.android.gms.fido.u2f.api.view.PinConfirmViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.PinConfirmViewOptions
            r0.<init>()
            goto L87
        L37:
            com.google.android.gms.fido.u2f.api.view.PinCreateViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.PinCreateViewOptions
            r0.<init>()
            goto L87
        L3d:
            com.google.android.gms.fido.u2f.api.view.UsbViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.UsbViewOptions
            r0.<init>()
            goto L87
        L43:
            com.google.android.gms.fido.u2f.api.view.NfcRemoveKeyViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.NfcRemoveKeyViewOptions
            r0.<init>()
            goto L87
        L49:
            com.google.android.gms.fido.u2f.api.view.NfcKeyDiscoveredViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.NfcKeyDiscoveredViewOptions
            r0.<init>()
            goto L87
        L4f:
            com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions r0 = new com.google.android.gms.fido.u2f.api.view.NfcEnableViewOptions
            r0.<init>()
            goto L87
        L55:
            java.lang.String r0 = "deviceRemovedTooSoon"
            boolean r1 = r8.has(r0)
            if (r1 == 0) goto L62
            boolean r0 = r8.getBoolean(r0)
            goto L63
        L62:
            r0 = r3
        L63:
            java.lang.String r1 = "recommendUsb"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L6f
            boolean r3 = r8.getBoolean(r1)
        L6f:
            com.google.android.gms.fido.u2f.api.view.NfcViewOptions r1 = new com.google.android.gms.fido.u2f.api.view.NfcViewOptions
            r1.<init>(r0, r3)
            goto L86
        L75:
            java.lang.String r0 = "transports"
            org.json.JSONArray r0 = r8.getJSONArray(r0)
            java.util.List r0 = com.google.android.gms.fido.common.Transport.b(r0)
            if (r0 == 0) goto L9a
            com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions r1 = new com.google.android.gms.fido.u2f.api.view.MultiTransportViewOptions
            r1.<init>(r0)
        L86:
            r0 = r1
        L87:
            java.lang.String r1 = "isRegistrationRequest"
            boolean r2 = r8.has(r1)
            if (r2 == 0) goto L99
            boolean r8 = r8.getBoolean(r1)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r0.c = r8
        L99:
            return r0
        L9a:
            org.json.JSONException r8 = new org.json.JSONException
            java.lang.String r0 = "null transports unexpected in MultiTransportViewOptions"
            r8.<init>(r0)
            throw r8
        La2:
            int r4 = r4 + 1
            goto Ld
        La6:
            bcsl r8 = new bcsl     // Catch: defpackage.bcsl -> Lac
            r8.<init>(r0)     // Catch: defpackage.bcsl -> Lac
            throw r8     // Catch: defpackage.bcsl -> Lac
        Lac:
            r8 = move-exception
            org.json.JSONException r0 = new org.json.JSONException
            java.lang.String r8 = r8.getMessage()
            java.lang.String r8 = defpackage.eiif.b(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.view.ViewOptions.f(org.json.JSONObject):com.google.android.gms.fido.u2f.api.view.ViewOptions");
    }

    public JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewName", d().j);
            Boolean bool = this.c;
            if (bool != null) {
                jSONObject.put("isRegistrationRequest", bool);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public int b() {
        return this.a;
    }

    public Transport c() {
        throw new UnsupportedOperationException("getTransport() unimplemented");
    }

    public bcsm d() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public JSONObject e() {
        throw new UnsupportedOperationException("This method must be overwritten by subclasses");
    }

    public final String toString() {
        return a().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, b());
        arxc.c(parcel, a);
    }

    public ViewOptions() {
        this(1);
    }
}
