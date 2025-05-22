package com.google.android.gms.smartdevice.utils;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.aulw;
import defpackage.auly;
import defpackage.dgxw;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public abstract class BinarySerializableFastSafeParcelableJson extends FastSafeParcelableJsonResponse {
    public final void ax(byte[] bArr) {
        try {
            new auly().h(new ByteArrayInputStream(bArr), this);
        } catch (aulw e) {
            throw new dgxw(e);
        }
    }

    public final byte[] ay() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("SmartDevice", "Error serializing object.", e);
            return new byte[0];
        }
    }
}
