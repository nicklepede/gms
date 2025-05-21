package com.google.android.gms.trustagent.trustlet.device.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.trustagent.trustlet.device.bluetooth.model.TrustableDevice;
import com.google.android.gms.trustagent.trustlet.device.ui.TrustedDevicesCollapsingToolbarChimeraSettings;
import defpackage.abt;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dgms;
import defpackage.dgoy;
import defpackage.dgqz;
import defpackage.dgsk;
import defpackage.ejhf;
import defpackage.ngn;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustedDevicesCollapsingToolbarChimeraSettings extends dgms implements dgoy, abt {
    private static final asot l = asot.b("TrustAgent", asej.TRUSTAGENT);
    public dgqz k;
    private boolean m = false;

    @Override // defpackage.dgmp
    protected final ngn a() {
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null && intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            int i = extras != null ? extras.getInt("notification_type_key", -1) : -1;
            if (i >= 0) {
                bundle.putInt("notification_type", i);
            }
        }
        dgsk dgskVar = new dgsk();
        dgskVar.setArguments(bundle);
        return dgskVar;
    }

    @Override // defpackage.dgoy
    public final void b() {
        h().N();
    }

    @Override // defpackage.dgmp
    protected final String c() {
        return "TrustedDevicesFragment";
    }

    public final dgsk h() {
        return (dgsk) getSupportFragmentManager().h("TrustedDevicesFragment");
    }

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (asqh.f()) {
            j.intValue();
            if (i == -11) {
                finish();
                i = -11;
            }
        }
        Intent intent = activityResult.b;
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_request_code", 0);
        if (i == -1) {
            if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.DEVICE_ENROLLED_IN_ACTIVE_UNLOCK")) {
                h().M((TrustableDevice) TrustableDevice.e(intent).orElseThrow());
            } else if (intExtra != 1002) {
                ((ejhf) l.j()).x("Unknown intent action or request code");
            } else if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.trustagent.ADD_DEVICE")) {
                TrustableDevice.e(intent).ifPresent(new Consumer() { // from class: dgrr
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void q(Object obj2) {
                        TrustedDevicesCollapsingToolbarChimeraSettings.this.k.a((TrustableDevice) obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
    }

    @Override // defpackage.dgms, defpackage.dgmp, defpackage.dgmo, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = new dgqz(this);
        if (bundle != null) {
            this.m = bundle.getBoolean("TrustedDeviceDialogActionTakenKey", false);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // defpackage.dgmp, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.trusted_devices_actions_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getString(R.string.auth_trust_agent_bluetooth_disabled_help_link))));
        return true;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("TrustedDeviceDialogActionTakenKey", this.m);
        super.onSaveInstanceState(bundle);
    }
}
