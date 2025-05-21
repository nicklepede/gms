package com.google.android.gms.wearable.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.dmij;
import defpackage.dmik;
import defpackage.dmil;
import defpackage.ijv;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WearableManageSpaceChimeraActivity extends qfp implements AdapterView.OnItemClickListener, View.OnClickListener {
    public View j;
    public TextView k;
    public Button l;
    public ListView m;
    private dmil n;
    private dmik o;

    public final void a() {
        this.j.setVisibility(0);
        this.l.setEnabled(false);
        dmil dmilVar = this.n;
        if (dmilVar != null) {
            dmilVar.cancel(true);
        }
        dmil dmilVar2 = new dmil(this);
        this.n = dmilVar2;
        dmilVar2.execute(new Void[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Button button = this.l;
        if (view == button) {
            button.setEnabled(false);
            this.j.setVisibility(0);
            this.l.setEnabled(false);
            dmik dmikVar = this.o;
            if (dmikVar != null) {
                dmikVar.cancel(true);
            }
            dmik dmikVar2 = new dmik(this);
            this.o = dmikVar2;
            dmikVar2.execute(new Void[0]);
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow();
        setContentView(R.layout.wearable_manage_space_activity);
        this.j = findViewById(R.id.wearable_progress_bar);
        this.k = (TextView) findViewById(R.id.total_size_text);
        this.l = (Button) findViewById(R.id.reclaim_button);
        ListView listView = (ListView) findViewById(R.id.apps_list);
        this.m = listView;
        listView.setOnItemClickListener(this);
        this.l.setOnClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        dmij dmijVar = (dmij) this.m.getAdapter();
        if (dmijVar != null && i >= 0 && i < dmijVar.getCount()) {
            String str = dmijVar.getItem(i).a;
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", str, null));
            startActivity(intent);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        ijv.e(getContainerActivity());
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        dmil dmilVar = this.n;
        if (dmilVar != null) {
            dmilVar.cancel(true);
            this.n = null;
        }
        dmik dmikVar = this.o;
        if (dmikVar != null) {
            dmikVar.cancel(true);
            this.o = null;
        }
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        a();
    }
}
