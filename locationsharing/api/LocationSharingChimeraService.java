package com.google.android.gms.locationsharing.api;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationSharingChimeraService extends TracingIntentService {
    public static final asot a = asot.e(asej.LOCATION_SHARING);
    public aqxo b;

    public LocationSharingChimeraService() {
        super("LocationSharingService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0363  */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [fgrf] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [android.accounts.Account] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [casp] */
    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r27) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.locationsharing.api.LocationSharingChimeraService.a(android.content.Intent):void");
    }

    public final void b(PendingIntent pendingIntent) {
        Intent intent = new Intent();
        intent.putExtra("api_version", "2");
        try {
            pendingIntent.send(this, 1, intent);
        } catch (PendingIntent.CanceledException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5677)).x("Error sending pending intent: ");
        }
    }

    public final void c(PendingIntent pendingIntent, Intent intent) {
        try {
            pendingIntent.send(this, 0, intent);
        } catch (PendingIntent.CanceledException e) {
            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 5678)).x("Error sending pending intent: ");
        }
    }
}
