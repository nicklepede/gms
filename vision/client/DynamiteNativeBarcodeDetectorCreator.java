package com.google.android.gms.vision.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import defpackage.aqbk;
import defpackage.bblp;
import defpackage.dkmn;
import defpackage.dkne;
import defpackage.dkng;
import defpackage.dknh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes7.dex */
public class DynamiteNativeBarcodeDetectorCreator extends dkng {
    @Override // defpackage.dknh
    public dkne newBarcodeDetector(bblp bblpVar, BarcodeDetectorOptions barcodeDetectorOptions) {
        Context a = aqbk.a((Context) ObjectWrapper.a(bblpVar), "com.google.android.gms.vision.dynamite");
        if (a == null) {
            dkmn.a("%s could not be loaded.", "com.google.android.gms.vision.dynamite");
            throw new RemoteException();
        }
        dknh asInterface = dkng.asInterface(aqbk.b(a.getClassLoader(), "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"));
        if (asInterface != null) {
            return asInterface.newBarcodeDetector(bblpVar, barcodeDetectorOptions);
        }
        dkmn.a("Could not load Chimera native barcode detector creator.", new Object[0]);
        throw new RemoteException();
    }
}
